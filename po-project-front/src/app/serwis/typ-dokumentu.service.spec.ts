import { TestBed } from '@angular/core/testing';

import { TypDokumentuService } from './typ-dokumentu.service';

describe('TypDokumentuService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: TypDokumentuService = TestBed.get(TypDokumentuService);
    expect(service).toBeTruthy();
  });
});
