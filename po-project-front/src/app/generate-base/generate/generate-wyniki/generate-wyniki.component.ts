import { Component, OnInit } from '@angular/core';
import { DokumentyService } from 'src/app/serwis/dokumenty.service';

@Component({
  selector: 'app-generate-wyniki',
  templateUrl: './generate-wyniki.component.html',
  styleUrls: ['./generate-wyniki.component.css']
})
export class GenerateWynikiComponent implements OnInit {

  imagePath: string;

  constructor(private documentsService: DokumentyService) { }

  ngOnInit() {
    this.imagePath = this.documentsService.address;
  }

}
