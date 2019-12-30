import { TestBed } from '@angular/core/testing';

import { PaczkaService } from './paczka.service';

describe('PaczkaService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: PaczkaService = TestBed.get(PaczkaService);
    expect(service).toBeTruthy();
  });
});
