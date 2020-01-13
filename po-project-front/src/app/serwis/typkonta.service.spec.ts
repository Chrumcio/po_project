import { TestBed } from '@angular/core/testing';

import { TypkontaService } from './typkonta.service';

describe('TypkontaService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: TypkontaService = TestBed.get(TypkontaService);
    expect(service).toBeTruthy();
  });
});
