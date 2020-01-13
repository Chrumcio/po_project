import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { GenerateFakturaComponent } from './generate-faktura.component';

describe('GenerateFakturaComponent', () => {
  let component: GenerateFakturaComponent;
  let fixture: ComponentFixture<GenerateFakturaComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GenerateFakturaComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GenerateFakturaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
