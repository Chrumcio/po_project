import { TestBed } from '@angular/core/testing';

import { KlientService } from './klient.service';

describe('KlientService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: KlientService = TestBed.get(KlientService);
    expect(service).toBeTruthy();
  });
});
