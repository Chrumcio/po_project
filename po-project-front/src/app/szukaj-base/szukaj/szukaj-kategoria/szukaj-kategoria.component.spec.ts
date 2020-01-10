import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SzukajKategoriaComponent } from './szukaj-kategoria.component';

describe('SzukajKategoriaComponent', () => {
  let component: SzukajKategoriaComponent;
  let fixture: ComponentFixture<SzukajKategoriaComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SzukajKategoriaComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SzukajKategoriaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
