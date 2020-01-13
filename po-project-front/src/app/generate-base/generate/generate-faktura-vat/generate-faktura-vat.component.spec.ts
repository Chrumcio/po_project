import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { GenerateFakturaVATComponent } from './generate-faktura-vat.component';

describe('GenerateFakturaVATComponent', () => {
  let component: GenerateFakturaVATComponent;
  let fixture: ComponentFixture<GenerateFakturaVATComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GenerateFakturaVATComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GenerateFakturaVATComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
