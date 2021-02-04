import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AlternateConf } from 'src/app/models/alternate-conf';
import { Configuration } from 'src/app/models/configuration';
import { Variant } from 'src/app/models/variant';
import { AlternateService } from 'src/app/services/alternate.service';
import { ConfigurationService } from 'src/app/services/configuration.service';
import { VariantService } from 'src/app/services/variant.service';

@Component({
  selector: 'app-standard',
  templateUrl: './standard.component.html',
  styleUrls: ['./standard.component.css']
})
export class StandardComponent implements OnInit {

  constructor(private _alternateService : AlternateService,
    private _configurationService : ConfigurationService,
    private _variantService : VariantService,
    private _router : Router) { }

  public defaultConfigurations : Configuration[] = [];
  public configurableDefaultConfigurations : Configuration[] = [];
  public alternateConfs : AlternateConf[] = [];
  public variant : Variant = new Variant(0,'',0,0,0,0,'');  
  public var_id : number = 0;
  public altMap = new Map<string,AlternateConf[]>();

  ngOnInit(): void {

    this.var_id = this._variantService.getVariantId();

    this._configurationService.getAllDefaultFeatures(this.var_id).subscribe((data)=>{
      this.defaultConfigurations =data;
      console.log(this.defaultConfigurations);
    }
  );

    this._variantService.getVariantByVarid(this.var_id).subscribe((data) => {
      this.variant = data;
      console.log(this.variant);
  });

    this._configurationService.getAllConfigurableDefaultFeatures(this.var_id).subscribe((data)=>{
      this.configurableDefaultConfigurations = data;
      console.log(this.configurableDefaultConfigurations);
      if (this.configurableDefaultConfigurations.length > 0)
          this.getAllAlternateConfigurations();
    });

  }

  getAllAlternateConfigurations(){
      this.configurableDefaultConfigurations.forEach(element => {
        console.log(element.conf_id);
        this._alternateService.getAlternateConfByConfid(element.conf_id).subscribe(
          (data)=>{
            this.altMap.set(element.description,data);
          }
        );   
      });
  }


  managePrice(event : any){
    console.log(event.target.value);
  }

}
