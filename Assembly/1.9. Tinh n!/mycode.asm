.Model Small
.Stack 100h
.Data   
    input db "Nhap n: ","$"
    output db "Ket qua la: ", "$"
.Code
 Start:
    mov ax, @Data
    mov ds, ax    
    
    nhap: 
        mov ah, 02
        mov dl, 10        ; xuong dong
        int 21h  
        
        mov ah, 02
        mov dl, 13
        int 21h        ; ve dau dong
        
        mov ah, 09
        mov dx, offset input       ; nhap
        int 21h
        
        
        mov Ah, 01H        
        int 21H
        
        cmp al, 30h         ; khac so thi lap lai
        jl nhap
        cmp al, 39h
        jg nhap
                  
        sub al,30h            
        mov cl,al         
        mov ch,0         
        mov ax,1
        cmp cx, 0
        je dacb          
    
    lap:
        
        mul cx               
    loop lap    
        mov bx,10        
    
    chia:
        mov dx,0
        div bx           
        inc cx           
        push dx          
        cmp ax, 0
        je inra           ; so sanh bang
        jmp chia          ; k dieu kien
    
    inra:
        mov ah, 02
        mov dl, 10        ; xuong dong
        int 21h  
        mov ah, 02
        mov dl, 13        ; ve dau dong
        int 21h
        mov ah, 09
        mov dx, offset output          ; in ra
        int 21h
    
    ht:    
        pop dx            
        add dx,30h       
        mov ah,2
        int 21h
    loop ht  
    jmp kt
    
    dacb:   mov ah, 02
        mov dl, 10        ; xuong dong
        int 21h  
        
        mov ah, 02
        mov dl, 13
            mov ah, 02
            mov dl, 49
            int 21h
            
    kt: mov ah, 4ch
        int 21h
        
End