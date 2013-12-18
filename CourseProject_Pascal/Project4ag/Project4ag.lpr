program Project4ag;

uses
    sysutils, windows, strutils;

const
  defaultCity : array[0..29] of String = ('Blagoevgrad','Gabrovo','Asenovgrad',
   'Kazanlak','Vidin','Vratsa','Kyustendil','Montana','Kardzhali',
   'Dimitrovgrad','Lovech','Dupnica','Silistra','Targovishte',
   'Gorna Oryahovitsa','Smoljan','Razgrad','Svishtov','Petrich','Svistov',
   'Samokov','Sandanski','Lom','Karlovo','Velingrad','Nova Zagora',
   'Sevlievo','Trojan', 'Pleven', 'Teteven');
type
  StringArray = array of String;
var
  cities, filtered: StringArray;

procedure AddCity(var inputArray: StringArray; city: String);
var
   count : Integer;
begin
   count := Length(inputArray);
   SetLength(inputArray, count + 1);
   inputArray[count] := city;
end;

procedure GetCities;
var
  stop : Boolean = false;
  input: String;
begin
   WriteLn('Enter city or 1 for exit or 2 for default cities:');
   repeat
     ReadLn(input);
     input := AnsiToUtf8(input);
     if (input = '1') then
        stop := true
     else if (input = '2') then
     begin
        cities := defaultCity;
        stop:= true;
     end
     else
         AddCity(cities, input);
   until stop;
end;

procedure FilterCities;
var
  i, j : Integer;
  currentCity : String;
  eCount : Integer;
  pCount : Integer;
begin
  for i:= Low(cities) to High(cities) do
  begin
    eCount := 0;
    pCount := 0;
    currentCity:= cities[i];

    for j := 0 to Length(currentCity)-1 do
    begin
      if (currentCity[j] = 'e') or (currentCity[j] = 'E') then
         eCount := eCount + 1
      else if (currentCity[j] = 'r') then
           pCount := pCount + 1;
    end;

    if (pCount = 0) and ((eCount >= 2) and (eCount <= 4)) then
       AddCity(filtered, currentCity);

  end;
end;

procedure PrintArray(inputArray : StringArray);
var
  i : Integer;
begin
  for i:= Low(inputArray) to High(inputArray) do
  begin
    WriteLn(inputArray[i]);
  end;
end;

begin  //main
  GetCities;
  FilterCities;
  PrintArray(filtered);

  WriteLn('Press Enter to exit');
  readln;
end.

