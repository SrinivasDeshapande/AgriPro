import { Component, OnInit } from '@angular/core';
import { ExpenseTypes } from '../models/expenseTrack.model';
import { CommonService } from '../commonservice/common.service';

@Component({
  selector: 'app-expense-type',
  templateUrl: './expense-type.component.html',
  styleUrls: ['./expense-type.component.scss']
})
export class ExpenseTypeComponent implements OnInit {
  expensetypeVO: ExpenseTypes = new ExpenseTypes();
  constructor( private api: CommonService) { }

  ngOnInit() {
  }

  addExpenseType(){

  }
}
