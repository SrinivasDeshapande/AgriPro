import { Deserializable} from '../interfaces/deserializable';

export class Expense implements Deserializable{

    public expenseId : number = 0;
	public name : string;
	public type_id: number;
	public dateOfExp: Date;
	public  quantity : number;
	public rate : number;
	public amount : number;
	public discount : number;
	public billId: number;
	public description: string ;
	public cropId: number;
	public farmid: number;
	public creator_id: number;
    public updator_id: number;
	

    deserialize(input: any) {
        Object.assign(this, input);
        return this;
      }
}
