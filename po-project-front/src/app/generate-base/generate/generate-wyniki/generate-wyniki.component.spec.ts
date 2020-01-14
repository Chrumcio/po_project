import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { GenerateWynikiComponent } from './generate-wyniki.component';

describe('GenerateWynikiComponent', () => {
  let component: GenerateWynikiComponent;
  let fixture: ComponentFixture<GenerateWynikiComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GenerateWynikiComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GenerateWynikiComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
