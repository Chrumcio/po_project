import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-szukaj-error',
  templateUrl: './szukaj-error.component.html',
  styleUrls: ['./szukaj-error.component.css']
})
export class SzukajErrorComponent implements OnInit {

  errorMessage: string;
  errorPath: string;

  constructor(private route: ActivatedRoute, private router: Router) { }

  ngOnInit() {
    this.errorMessage = history.state.errorMessage;
    this.errorPath = history.state.errorPath;
  }

}
