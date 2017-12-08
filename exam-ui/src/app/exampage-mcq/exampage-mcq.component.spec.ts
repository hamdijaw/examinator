/* tslint:disable:no-unused-variable */
import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { By } from '@angular/platform-browser';
import { DebugElement } from '@angular/core';

import { ExampageMcqComponent } from './exampage-mcq.component';

describe('ExampageMcqComponent', () => {
  let component: ExampageMcqComponent;
  let fixture: ComponentFixture<ExampageMcqComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ExampageMcqComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ExampageMcqComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
