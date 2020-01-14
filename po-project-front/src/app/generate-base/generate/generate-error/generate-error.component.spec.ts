import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { GenerateErrorComponent } from './generate-error.component';

describe('GenerateErrorComponent', () => {
  let component: GenerateErrorComponent;
  let fixture: ComponentFixture<GenerateErrorComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GenerateErrorComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GenerateErrorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
