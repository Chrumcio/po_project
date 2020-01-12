import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SzukajKategoriaSzczegolyComponent } from './szukaj-kategoria-szczegoly.component';

describe('SzukajKategoriaSzczegolyComponent', () => {
  let component: SzukajKategoriaSzczegolyComponent;
  let fixture: ComponentFixture<SzukajKategoriaSzczegolyComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SzukajKategoriaSzczegolyComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SzukajKategoriaSzczegolyComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
