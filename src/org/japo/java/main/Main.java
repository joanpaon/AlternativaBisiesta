/* 
 * Copyright 2016 José A. Pacheco Ondoño - joanpaon@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Calendar;
import java.util.GregorianCalendar;
//import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Instancia un objeto Scanner
//        Scanner sc = new Scanner(System.in);
        
        // Introduce el año a analizar
//        System.out.print("Introduzca año: ");
//        int any = sc.nextInt();
        
        // Acceso al calendario del sistema
        GregorianCalendar gc = new GregorianCalendar();
        
        // Variables
        String decision;
        int any = gc.get(Calendar.YEAR);

        // Analiza el año
        if (any % 400 == 0) {
            decision = "SI";
        } else if (any % 100 == 0) {
            decision = "NO";
        } else if (any % 4 == 0) {
            decision = "SI";
        } else {
            decision = "NO";
        }
        
        // Mensaje Resultado
        System.out.printf("El año %d %s es bisiesto\n", any, decision);
    }
}
