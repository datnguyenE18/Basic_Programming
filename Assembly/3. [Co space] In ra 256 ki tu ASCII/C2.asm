.Model Small
.Stack 100h
.Data
    nope db "256 ASCII characters are :", "$"
    space db " ","$"
    t db 0
    c db 32
    f db 25
.Code
Start:
    MOV AX,@Data   
    MOV DS,AX
    ;mov AH,9                   
    ;mov DX, offset nope
    ;int 21H
    MOV CX, 256
    MOV AH,2
    loop:
        MOV DL,t
        INT 21H
        MOV Dl, c
        INT 21h
        INC t
        DEC CX
        DEC f
        CMP f, 0
        JE new:     
        CMP t, 007
        JE RA:
        CMP t, 013     
        JE RA:
        JNZ loop
    RA: ADD t, 4
        JMP loop
    new:
        MOV f , 25
        MOV Dl, 010
        INT 21h
        MOV dl, 013
        INT 21h
        JMP loop
    MOV AH, 4CH
    INT 21H
End Start