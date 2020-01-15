import { TestBed } from '@angular/core/testing';

import { DokumentyService } from './dokumenty.service';

describe('DokumentyService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: DokumentyService = TestBed.get(DokumentyService);
    expect(service).toBeTruthy();
  });
});
