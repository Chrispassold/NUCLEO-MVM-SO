/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author christianp
 */
public class Programas {

    short mem[];

    Programas(short mem[]) {
        this.mem = mem;
    }

    public short[] prova1(int enderecoDeCarga) {
        mem[0 + enderecoDeCarga] = 26;
        mem[1 + enderecoDeCarga] = 35;
        mem[35 + enderecoDeCarga] = 0;
        mem[36 + enderecoDeCarga] = 44;
        mem[37 + enderecoDeCarga] = 20;
        mem[38 + enderecoDeCarga] = 48;
        mem[39 + enderecoDeCarga] = 44;
        mem[40 + enderecoDeCarga] = 25;
        mem[41 + enderecoDeCarga] = 9;
        mem[42 + enderecoDeCarga] = 2;
        mem[43 + enderecoDeCarga] = 44;
        mem[44 + enderecoDeCarga] = 79;
        mem[45 + enderecoDeCarga] = 52;
        mem[46 + enderecoDeCarga] = 2;
        
        //push
        mem[25 + enderecoDeCarga] = 31;
        mem[26 + enderecoDeCarga] = 44;
        mem[27 + enderecoDeCarga] = 5;
        mem[28 + enderecoDeCarga] = 30;
        mem[29 + enderecoDeCarga] = 38;
        mem[30 + enderecoDeCarga] = 30;
        mem[31 + enderecoDeCarga] = 51;
        //end push
        
        mem[47 + enderecoDeCarga] = 44;
        mem[48 + enderecoDeCarga] = 76;
        mem[49 + enderecoDeCarga] = 52;
        mem[50 + enderecoDeCarga] = 2;  
        
        //push
        mem[25 + enderecoDeCarga] = 31;
        mem[26 + enderecoDeCarga] = 44;
        mem[27 + enderecoDeCarga] = 5;
        mem[28 + enderecoDeCarga] = 30;
        mem[29 + enderecoDeCarga] = 38;
        mem[30 + enderecoDeCarga] = 30;
        mem[31 + enderecoDeCarga] = 51;
        //end push
        
        mem[51 + enderecoDeCarga] = 44;
        mem[52 + enderecoDeCarga] = 65;
        mem[53 + enderecoDeCarga] = 52;
        mem[54 + enderecoDeCarga] = 2;
        
        //push
        mem[25 + enderecoDeCarga] = 31;
        mem[26 + enderecoDeCarga] = 44;
        mem[27 + enderecoDeCarga] = 5;
        mem[28 + enderecoDeCarga] = 30;
        mem[29 + enderecoDeCarga] = 38;
        mem[30 + enderecoDeCarga] = 30;
        mem[31 + enderecoDeCarga] = 51;
        //end push
        
        mem[55 + enderecoDeCarga] = 40;
        
        
        
        
        
        
        return mem;
    }
    
    public short[] programa1(int enderecoDeCarga) {
        mem[0 + enderecoDeCarga] = 26;
        mem[1 + enderecoDeCarga] = 18;
        mem[18 + enderecoDeCarga] = 0;
        mem[19 + enderecoDeCarga] = 44;
        mem[20 + enderecoDeCarga] = 9;
        mem[21 + enderecoDeCarga] = 48;
        mem[22 + enderecoDeCarga] = 27;
        mem[23 + enderecoDeCarga] = 10;
        mem[10 + enderecoDeCarga] = 0;
        mem[11 + enderecoDeCarga] = 9;
        mem[12 + enderecoDeCarga] = 2;
        mem[13 + enderecoDeCarga] = 9;
        mem[14 + enderecoDeCarga] = 3;
        mem[15 + enderecoDeCarga] = 28;
        mem[24 + enderecoDeCarga] = 27;
        mem[25 + enderecoDeCarga] = 10;
        mem[10 + enderecoDeCarga] = 0;
        mem[11 + enderecoDeCarga] = 9;
        mem[12 + enderecoDeCarga] = 2;
        mem[13 + enderecoDeCarga] = 9;
        mem[14 + enderecoDeCarga] = 3;
        mem[15 + enderecoDeCarga] = 28;
        mem[26 + enderecoDeCarga] = 40;
        return mem;
    }

    public short[] programa2(int enderecoDeCarga) {
        mem[0 + enderecoDeCarga] = 26;
        mem[1 + enderecoDeCarga] = 18;
        mem[18 + enderecoDeCarga] = 0;
        mem[19 + enderecoDeCarga] = 44;
        mem[20 + enderecoDeCarga] = 9;
        mem[21 + enderecoDeCarga] = 48;
        mem[22 + enderecoDeCarga] = 27;
        mem[23 + enderecoDeCarga] = 10;
        mem[10 + enderecoDeCarga] = 19;
        mem[11 + enderecoDeCarga] = 9;
        mem[12 + enderecoDeCarga] = 2;
        mem[13 + enderecoDeCarga] = 9;
        mem[14 + enderecoDeCarga] = 3;
        mem[15 + enderecoDeCarga] = 28;
        mem[24 + enderecoDeCarga] = 27;
        mem[25 + enderecoDeCarga] = 10;
        mem[10 + enderecoDeCarga] = 19;
        mem[11 + enderecoDeCarga] = 9;
        mem[12 + enderecoDeCarga] = 2;
        mem[13 + enderecoDeCarga] = 9;
        mem[14 + enderecoDeCarga] = 3;
        mem[15 + enderecoDeCarga] = 28;
        mem[26 + enderecoDeCarga] = 40;
        return mem;
    }

    public short[] programa3Fluxograma() {        
        mem[0] = 26; //jump 10
        mem[1] = 10;
        
        mem[10] = 44; //AX=19
        mem[11] = 19;
        
        mem[12] = 9; //MOVE [0], AX
        mem[13] = 0; //[0] = 19
        
        mem[14] = 5; //MOVE AX,[5]
        mem[15] = 5; //AX = 249
        
        mem[16] = 48; //MOVE SP, AX -> SP = 249
        
        
        //iret
        //POP CX -> sp = 250; CX = mem[250] (0);
        //POP BX -> sp = 251; BX = mem[251] (0);
        //POP AX -> sp = 252; AX = mem[252] (0);
        //POP BP -> sp = 253; BP = mem[253] (0);
        //ret -> sp = 254; ip = mem[254] (19);
        mem[17] = 51;
        
        mem[19] = 0; //init ax
        
        mem[20] = 4; //move cx,ax
        
        mem[21] = 5; //MOVE AX,[6]
        mem[22] = 6; //AX = 0
        
        mem[23] = 3; //move bx,ax -> BX = 0
        
        mem[24] = 44; //MOVE AX, {0}
        mem[25] = 0; //AX = 0
        
        mem[26] = 45; //test axEqbx,30 -> se AX==BX entao IP = 30
        mem[27] = 30;
        
        mem[28] = 26; //jump 39
        mem[29] = 39;
        
        mem[30] = 4; //MOVE CX, AX -> CX = 0
        
        mem[31] = 5; // MOVE AX, [2]
        mem[32] = 2; // AX = 204
        
        mem[33] = 48;// MOVE SP, AX -> SP = 204
        
        mem[34] = 21; //CX++
                
        mem[35] = 2;// MOVE AX, CX -> AX = 1
        
        mem[36] = 9; //MOVE [6], AX
        mem[37] = 6; // AX = 0;
        
        //iret
        //POP CX -> sp = 205; CX = mem[205] (0);
        //POP BX -> sp = 206; BX = mem[206] (0);
        //POP AX -> sp = 207; AX = mem[207] (0);
        //POP BP -> sp = 208; BP = mem[208] (0);
        //ret -> sp = 209; ip = mem[209] (70);
        mem[38] = 51;
        
        mem[70] = 26; //JUMP 70
        mem[71] = 70;
        
        mem[74] = 26; //JUMP 74
        mem[75] = 74;
        
        mem[78] = 26; //JUMP 78
        mem[79] = 78;
        
       
        mem[39] = 44;//MOVE AX, {1}
        mem[40] = 1;// AX = 1
        
        mem[41] = 45; //test axEqbx,45 -> se AX==BX entao IP = 45
        mem[42] = 45;
        
        mem[43] = 26;//JUMP 54
        mem[44] = 54;
        
        mem[54] = 0; //init ax
        
        mem[55] = 9; //MOVE [6], AX
        mem[56] = 6;// [6] = 0
        
        mem[57] = 5;//move ax, [4]
        mem[58] = 4;//AX = 234
        
        mem[59] = 48; //MOVE SP, AX -> SP = 234
        
        //iret
        //POP CX -> sp = 235; CX = mem[235] (0);
        //POP BX -> sp = 236; BX = mem[236] (0);
        //POP AX -> sp = 237; AX = mem[237] (0);
        //POP BP -> sp = 238; BP = mem[238] (0);
        //ret -> sp = 239; ip = mem[239] (78);
        mem[60] = 51;
        
        
        mem[45] = 4;// MOVE CX, AX -> CX = 0
        
        mem[46] = 5; //MOVE AX, [3]
        mem[47] = 3;// AX = 219
        
        mem[48] = 48; //MOVE SP, AX -> SP = 219
        
        mem[49] = 21; //CX++
        
        mem[50] = 2;// MOVE AX, CX -> AX = 1
        
        mem[51] = 9; //MOVE [6], AX
        mem[52] = 6; //[6] = 1
        
        //iret
        //POP CX -> sp = 220; CX = mem[220] (0);
        //POP BX -> sp = 221; BX = mem[221] (0);
        //POP AX -> sp = 222; AX = mem[222] (0);
        //POP BP -> sp = 223; BP = mem[223] (0);
        //ret -> sp = 224; ip = mem[224] (74);
        mem[53] = 51;
        
        
        //mem pre definida
        mem[2] = 204;
        mem[3] = 219;
        mem[4] = 234;
        mem[5] = 249;
        mem[6] = 0;
        
        mem[209] = 70;
        mem[208] = 0;
        mem[207] = 0;
        mem[206] = 0;
        mem[205] = 0;
        
        mem[224] = 74;
        mem[223] = 0;
        mem[222] = 0;
        mem[221] = 0;
        mem[220] = 0;
        
        mem[239] = 78;
        mem[238] = 0;
        mem[237] = 0;
        mem[236] = 0;
        mem[235] = 0;
        
        mem[254] = 19;
        mem[253] = 0;
        mem[252] = 0;
        mem[251] = 0;
        mem[250] = 0;
        
        
        
        
        
        return mem;
    }
    
}
