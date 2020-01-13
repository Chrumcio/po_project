import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { GenerateParagonComponent } from './generate-paragon.component';

describe('GenerateParagonComponent', () => {
  let component: GenerateParagonComponent;
  let fixture: ComponentFixture<GenerateParagonComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GenerateParagonComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GenerateParagonComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
