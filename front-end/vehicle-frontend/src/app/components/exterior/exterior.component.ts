import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AlternateConf } from 'src/app/models/alternate-conf';
import { Configuration } from 'src/app/models/configuration';
import { Variant } from 'src/app/models/variant';
import { AlternateService } from 'src/app/services/alternate.service';
import { ConfigurationService } from 'src/app/services/configuration.service';
import { VariantService } from 'src/app/services/variant.service';

@Component({
  selector: 'app-exterior',
  templateUrl: './exterior.component.html',
  styleUrls: ['./exterior.component.css']
})
export class ExteriorComponent implements OnInit {

  constructor(private _alternateService : AlternateService,
    private _configurationService : ConfigurationService,
    private _variantService : VariantService,
    private _router : Router) { }

  public exteriorConfigurations : Configuration[] = [];
  public configurableExteriorConfigurations : Configuration[] = [];
  public alternateConfs : AlternateConf[] = [];
  public variant : Variant = new Variant(0,'',0,0,0,0,'');  
  public var_id : number = 0;
  public altArray = new Array<AlternateConf[]>();


  ngOnInit(): void {

    this.var_id = this._variantService.getVariantId();

    this._configurationService.getAllExteriorFeatures(this.var_id).subscribe((data)=>{
      this.exteriorConfigurations =data;
      console.log(this.exteriorConfigurations);
    }
  );

    this._variantService.getVariantByVarid(this.var_id).subscribe((data) => {
      this.variant = data;
      console.log(this.variant);
  });

    this._configurationService.getAllConfigurableExteriorFeatures(this.var_id).subscribe((data)=>{
      this.configurableExteriorConfigurations = data;
      console.log(this.configurableExteriorConfigurations);
      if (this.configurableExteriorConfigurations.length > 0)
          this.getAllAlternateConfigurations();
    });
  }

  getAlternateDescription(conf_id : number){
    // this._alternateService.getAlternateConfByConfid(conf_id).subscribe(
    //   (data)=>{
    //     this.alternateConfs = data;
    //     console.log(this.alternateConfs);
    //   }
    // );
  }

  getAllAlternateConfigurations(){
    this.configurableExteriorConfigurations.forEach(element => {
      console.log(element.conf_id);
      this._alternateService.getAlternateConfByConfid(element.conf_id).subscribe(
        (data)=>{
          this.altArray.push(data);
          console.log(this.altArray);
        }
      );   
    });
  }

  managePrice(event : any, alt : AlternateConf[]){
    console.log(event.target.value);
  }


}

