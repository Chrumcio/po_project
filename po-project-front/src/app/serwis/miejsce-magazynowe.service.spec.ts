import { TestBed } from '@angular/core/testing';

import { MiejsceMagazynoweService } from './miejsce-magazynowe.service';

describe('MiejsceMagazynoweService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: MiejsceMagazynoweService = TestBed.get(MiejsceMagazynoweService);
    expect(service).toBeTruthy();
  });
});
