import { Component, OnInit, ViewChild, Input } from '@angular/core';
import { LoginFormComponent } from '../login-form/login-form.component';
import { Konto } from '../model/konto';

@Component({
  selector: 'app-zalogowano',
  template: `
  Say {{ message }}
`,  
  templateUrl: './zalogowano.component.html',
  styleUrls: ['./zalogowano.component.css']
})
export class ZalogowanoComponent implements OnInit {

 @Input() childMessage: Konto;

  fun(){
    console.log(this.childMessage.login);
  }

  constructor() { }

  ngOnInit() {
  }

}
