import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ListaPaczekComponent } from './lista-paczek.component';

describe('ListaPaczekComponent', () => {
  let component: ListaPaczekComponent;
  let fixture: ComponentFixture<ListaPaczekComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ListaPaczekComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ListaPaczekComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
