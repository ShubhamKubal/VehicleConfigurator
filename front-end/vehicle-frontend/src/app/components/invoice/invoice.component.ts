import { Component, OnInit } from '@angular/core';
import { AlternateConf } from 'src/app/models/alternate-conf';
import { InvoiceService } from 'src/app/services/invoice.service';

@Component({
  selector: 'app-invoice',
  templateUrl: './invoice.component.html',
  styleUrls: ['./invoice.component.css']
})
export class InvoiceComponent implements OnInit {

  public selectedConfMap = new Map<string, AlternateConf>();
  public finalPrice = 0;
  constructor(private _invoiceService : InvoiceService) { }

  ngOnInit(): void {

    this.selectedConfMap = this._invoiceService.selectedConfigurationMap;
    console.log(this.selectedConfMap);
    this.finalPrice = this._invoiceService.getInvoicePrice();
    
  }

}
