import { Component, OnInit ,ViewChild} from '@angular/core';
import { FormControl } from '@angular/forms';

// import {} from ''
import { Expense } from '../models/expense.model';
import {MatInput} from '@angular/material'
import { ExpesnesData, ExpenseTypes, CropsInformation, BillingInformation } from '../models/expenseTrack.model';
import { CommonService } from '../commonservice/common.service';
import {NgForm} from '@angular/forms';
import { startWith, map } from 'rxjs/operators';


@Component({
  selector: 'app-expense',
  templateUrl: './expense.component.html',
  styleUrls: ['./expense.component.scss']
})
export class ExpenseComponentComponent implements OnInit {
  expenseVO: Expense = new Expense();
  expenseData: ExpesnesData =new ExpesnesData();
  expenseTypeList: ExpenseTypes[] ;
  cropsList:CropsInformation[];
  // expenseType:ExpenseTypes;
  myControl = new FormControl();
  cropinfoControl = new FormControl();
  billControl=new FormControl();
  billslist:BillingInformation[];
  constructor(  private api: CommonService) { }
  @ViewChild('campFromInput', { read: MatInput }) campFromInput: MatInput;
  
  initialiseDefaultValues(){
    this.expenseData=new ExpesnesData();
    this.expenseVO = new Expense();
    this.myControl=new FormControl();
    this.cropinfoControl = new FormControl();
    this.billControl=new FormControl();
    this.expenseTypeList=[];
    this.cropsList=[];
    this.billslist=[];
    // this.expenseType=new ExpenseTypes();
    }
  
  ngOnInit() {
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
        map(value=>this._filterExpenseType(value))
      );
    }
    , (error) => {
      console.log(error);
    });

    this.api.getAllCropsInfo().subscribe((response:CropsInformation[])=>{
      this.cropsList=response;
      this.cropsList.forEach((element)=> {
        let typeFlag=false;
        if(element.cropId==this.expenseVO.cropId && !typeFlag){
          typeFlag=true;
          this.expenseVO.cropInfo=element;
        }
      })
      this.expenseData.cropsList=this.cropinfoControl.valueChanges.pipe(
        startWith(''),
        map(value=>this._filterCropsInfo(value))
      );
    });

    this.api.getAllBillsInfo().subscribe((response:BillingInformation[])=>{
      this.billslist=response;
      this.billslist.forEach((element)=> {
        let typeFlag=false;
        if(element.billId==this.expenseVO.billId && !typeFlag){
          typeFlag=true;
          this.expenseVO.billInfo=element;
          element.billerview=element.billNo+" - "+element.billerName;
        }
      })
      this.expenseData.billingList=this.billControl.valueChanges.pipe(
        startWith(''),
        map(value=>this._filterBills(value))
      );
    });
  }

  private _filterExpenseType(value1: string): ExpenseTypes[] {
    const filterValue1 = typeof (value1) === "string" ? value1.toLowerCase() : "";
    return this.expenseTypeList.filter(option1 => option1.name.toLowerCase().includes(filterValue1));
  }
  private _filterCropsInfo(value: string): CropsInformation[] {
    const filterValue = typeof (value) === "string" ? value.toLowerCase() : "";
    return this.cropsList.filter(option => option.cropName.toLowerCase().includes(filterValue));
  }
  private _filterBills(value: string): BillingInformation[] {
    const filterValue = typeof (value) === "string" ? value.toLowerCase() : "";
    return this.billslist.filter(option => option.billerName.toLowerCase().includes(filterValue));
  }
  displayFn(expenseType?: ExpenseTypes): string | undefined {
    return expenseType ? expenseType.name : undefined;
  }
  displayCropinfoControl(cropInfo?:CropsInformation):String|undefined{
    return cropInfo ? cropInfo.cropName:undefined;
  }
  displayBillsControl(billInfo?:BillingInformation):String|undefined{
    return billInfo ?billInfo.billNo+" - "+billInfo.billerName:undefined;
  }

}
