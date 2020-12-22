class human{
  constructor(){
    
    this.gender='female';
  }
  printmygender(){
  console.log(this.gender);}
  
}
class people extends human
{
  constructor(){
  super();
    this.name='remy';
    this.gender='female';}
  printmyname(){ 
    console.log(this.name);}
