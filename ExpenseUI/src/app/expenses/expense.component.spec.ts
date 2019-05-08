import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ExpenseComponentComponent } from './expense.component';

describe('ExpenseComponentComponent', () => {
  let component: ExpenseComponentComponent;
  let fixture: ComponentFixture<ExpenseComponentComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ExpenseComponentComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ExpenseComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
