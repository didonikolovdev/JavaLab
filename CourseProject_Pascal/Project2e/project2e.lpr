program project2e;

uses sysutils, math;

var
  x,y,z : array of Integer;

procedure InitArrays;
begin
  SetLength(x, Random(19) + 1);
  SetLength(y, Random(19) + 1);
  SetLength(z, Random(19) + 1);
end;

procedure FillArray(var inputArray : array of Integer);
var
  i : Integer;
begin
  for i:= Low(inputArray) to High(inputArray) do
  begin
    inputArray[i] := Random(200) - 100;
  end;
end;

procedure PrintArray(lbl : String; inputArray : array of Integer);
var
  i : Integer;
begin
  WriteLn(Format(lbl + ' has %d elements', [Length(inputArray)]));
  for i:= Low(inputArray) to High(inputArray) do
  begin
    WriteLn(Format(lbl + '[%d] = %d', [i, inputArray[i]]));
  end;
end;

function MeanGeom(inputArray: array of Integer) : Double;
var
   meanG : Double;
   i, prod, count : Integer;
begin
  prod := 1;
  count := 0;

  //calculate product of all between 6 and 50
  for i:= Low(inputArray) to High(inputArray) do
  begin
    if (inputArray[i] >= 6) and (inputArray[i] <= 50) then
    begin
      prod := prod * inputArray[i];
      count := count + 1;
    end;
  end;

  //check if can calculate mean geometric
  if (count > 0) then
    Result := power(prod, 1/count)
  else
      Result := 0;
end;

begin //main
  Randomize;

  InitArrays;

  FillArray(x);
  FillArray(y);
  FillArray(z);

  PrintArray('X', x);
  PrintArray('Y', y);
  PrintArray('Z', z);

  WriteLn(Format('Mean Geometic of X[] is %.5f', [MeanGeom(x)]));
  WriteLn(Format('Mean Geometic of Y[] is %.5f', [MeanGeom(y)]));
  WriteLn(Format('Mean Geometic of z[] is %.5f', [MeanGeom(z)]));

  Write('Press a key to exit');
  readln;
end.

