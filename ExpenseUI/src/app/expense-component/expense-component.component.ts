import { Component, OnInit ,ViewChild} from '@angular/core';
import { FormControl } from '@angular/forms';

// import {} from ''
import { Expense } from '../models/expense.model';
import {MatInput} from '@angular/material'
import { ExpesnesData, ExpenseTypes } from '../models/expenseTrack.model';
import { CommonService } from '../commonservice/common.service';
import {NgForm} from '@angular/forms';
import { startWith, map } from 'rxjs/operators';

@Component({
  selector: 'app-expense-component',
  templateUrl: './expense-component.component.html',
  styleUrls: ['./expense-component.component.scss']
})
export class ExpenseComponentComponent implements OnInit {
  expenseVO: Expense = new Expense();
  expenseData: ExpesnesData =new ExpesnesData();
  expenseTypeList: ExpenseTypes[] ;
  // expenseType:ExpenseTypes;
  myControl = new FormControl();
  
  constructor(  private api: CommonService) { }
  @ViewChild('campFromInput', { read: MatInput }) campFromInput: MatInput;
  
  initialiseDefaultValues(){
    this.expenseVO = new Expense();
    this.myControl=new FormControl();
    this.expenseTypeList=[];
    // this.expenseType=new ExpenseTypes();
    }
  private _filter(value: string): ExpenseTypes[] {
    const filterValue = typeof (value) === "string" ? value.toLowerCase() : "";
    return this.expenseTypeList.filter(option => option.name.toLowerCase().includes(filterValue));
  }
  displayFn(expenseType?: ExpenseTypes): string | undefined {
    return expenseType ? expenseType.name : undefined;
  }
  ngOnInit() {
    this.expenseVO = new Expense();
    this.api.getAllExpenseTypes().subscribe((response:ExpenseTypes[])=>{
      this.expenseTypeList=response;
      this.expenseTypeList.forEach((element)=> {
        let typeFlag=false;
        if(element.typeId==this.expenseVO.type_id && !typeFlag){
          typeFlag=true;
          this.expenseVO.expenseType=element;

        }
      })
      this.expenseData.expenseTypeList=this.myControl.valueChanges.pipe(
        startWith(''),
        map(value=>this._filter(value))
      );
    }
    );

    

  }

}
