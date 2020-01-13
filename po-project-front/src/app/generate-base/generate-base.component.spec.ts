import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { GenerateBaseComponent } from './generate-base.component';

describe('GenerateBaseComponent', () => {
  let component: GenerateBaseComponent;
  let fixture: ComponentFixture<GenerateBaseComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GenerateBaseComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GenerateBaseComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
