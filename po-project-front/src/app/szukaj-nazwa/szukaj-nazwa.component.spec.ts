import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SzukajNazwaComponent } from './szukaj-nazwa.component';

describe('SzukajNazwaComponent', () => {
  let component: SzukajNazwaComponent;
  let fixture: ComponentFixture<SzukajNazwaComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SzukajNazwaComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SzukajNazwaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
