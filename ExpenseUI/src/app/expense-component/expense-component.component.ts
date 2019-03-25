import { Component, OnInit ,ViewChild} from '@angular/core';
import {FormControl} from '@angular/forms';
import { Expense } from '../models/expense.model';
import {MatInput} from '@angular/material'
@Component({
  selector: 'app-expense-component',
  templateUrl: './expense-component.component.html',
  styleUrls: ['./expense-component.component.scss']
})
export class ExpenseComponentComponent implements OnInit {
  expenseVO: Expense = new Expense();
  constructor( ) { }
  @ViewChild('campFromInput', { read: MatInput }) campFromInput: MatInput;
  ngOnInit() {
  }

}
