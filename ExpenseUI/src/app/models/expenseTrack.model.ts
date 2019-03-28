import { Observable } from 'rxjs';
import { Deserializable } from '../interfaces/deserializable';

export class ExpesnesData{
    public billingList: Array<BillingInformation>=[];
    public cropsList: Array<CropsInformation>=[];
    public expenseTypeList:Observable<ExpenseTypes[]>;
    public framLandMappingList: Array<FarmLandMapping>=[];
}


export class BillingInformation implements Deserializable{
    public billId : number = 0;
	public billerName : string;
	public description: string;
	public billDate: Date;
	public creator_id: number;
    public updator_id: number;
    public createdOn: Date;
    deserialize(input: any) {
        Object.assign(this, input);
        return this;
      }
}

export class CropsInformation implements Deserializable{
    public cropId : number = 0;
	public cropName : string;
	public description: string;
    public farmid: number;
    public farmLandMapping: FarmLandMapping;
	public creator_id: number;
    public updator_id: number;
    public createdOn: Date;
    deserialize(input: any) {
        Object.assign(this, input);
        return this;
      }
}


export class ExpenseTypes implements Deserializable{
    public typeId : number = 0;
	public name : string;
	public description: string;
    public creator_id: number;
    public updator_id: number;
    public createdOn: Date;
    deserialize(input: any) {
        Object.assign(this, input);
        return this;
      }
}

export class FarmLandMapping{
    public farmId : number = 0;
    public farmerName : string;
    public landDetails: string;
    public areaOfLand: number;
    public sharePercentage: string;
    public season: string;
    public description: string;
    public creator_id: number;
    public updator_id: number;
    public createdOn: Date;
    
}