import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CommonalertsComponent } from './commonalerts.component';

describe('CommonalertsComponent', () => {
  let component: CommonalertsComponent;
  let fixture: ComponentFixture<CommonalertsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CommonalertsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CommonalertsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
