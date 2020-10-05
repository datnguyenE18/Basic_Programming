.Model Tiny
.Stack 100h
.Data
   xin_chao db "Hello World!", "$"
.Code
 Start:
    Mov AX,@Data      
    Mov DS, AX
    Mov AH,9
    Mov DX, Offset xin_chao
    Int 21h
    Mov AH,4Ch
 End Start