import { TestBed } from '@angular/core/testing';

import { EuContService } from './eu-cont.service';

describe('EuContService', () => {
  let service: EuContService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(EuContService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
