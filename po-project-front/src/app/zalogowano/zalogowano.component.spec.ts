import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ZalogowanoComponent } from './zalogowano.component';

describe('ZalogowanoComponent', () => {
  let component: ZalogowanoComponent;
  let fixture: ComponentFixture<ZalogowanoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ZalogowanoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ZalogowanoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
