import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-generate-error',
  templateUrl: './generate-error.component.html',
  styleUrls: ['./generate-error.component.css']
})
export class GenerateErrorComponent implements OnInit {

  errorMessage: string;
  errorPath: string;

  constructor(private route: ActivatedRoute, private router: Router) { }

  ngOnInit() {
    this.errorMessage = history.state.errorMessage;
    this.errorPath = history.state.errorPath;
  }

}
