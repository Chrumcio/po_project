import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SzukajComponent } from './szukaj.component';

describe('SzukajComponent', () => {
  let component: SzukajComponent;
  let fixture: ComponentFixture<SzukajComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SzukajComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SzukajComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
