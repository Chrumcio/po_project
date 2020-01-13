import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { KontoSerwis } from 'src/app/serwis/konto.serwis';

@Component({
  selector: 'app-generate',
  templateUrl: './generate.component.html',
  styleUrls: ['./generate.component.css']
})
export class GenerateComponent implements OnInit {

  constructor(private activatedRoute: ActivatedRoute, private router: Router,private konto:KontoSerwis) { }
  
  ngOnInit() {
  }

  generujFaktura(){
    this.router.navigate(['faktura'],{relativeTo: this.activatedRoute});
  }

  generujParagon(){
    this.router.navigate(['paragon'],{relativeTo: this.activatedRoute});
  }

}
