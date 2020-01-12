import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SzukajErrorComponent } from './szukaj-error.component';

describe('SzukajErrorComponent', () => {
  let component: SzukajErrorComponent;
  let fixture: ComponentFixture<SzukajErrorComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SzukajErrorComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SzukajErrorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
