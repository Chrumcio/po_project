import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SzukajBaseComponent } from './szukaj-base.component';

describe('SzukajBaseComponent', () => {
  let component: SzukajBaseComponent;
  let fixture: ComponentFixture<SzukajBaseComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SzukajBaseComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SzukajBaseComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
