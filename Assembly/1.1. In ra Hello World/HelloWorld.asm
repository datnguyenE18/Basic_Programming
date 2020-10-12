.Model Tiny                         ;code, data & program in 1 64K segment
.Stack 100h
.Data
   xin_chao db "Hello World!", "$"  ;xin_chao to be displayed terminated with $(indicates end of string)
.Code                               ;code segment
 Start:
    Mov AH,9                        ;function to display a string
    Mov DX, Offset xin_chao         ;offset of xin_chao string terminated with $
    Int 21h                         ;DOS interrupt
    Mov AH, 4Ch                     ;funtion to terminate
 End Start