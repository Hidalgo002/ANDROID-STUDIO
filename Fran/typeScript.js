//////////////////////////////////////////////////////////
//    VAMOS A EVOLUCIONAR EL CÓDIGO ANTERIOR PARA      //
//    AÑADIR IMÁGENES A LA APP                        //
///////////////////////////////////////////////////////


import { LinearGradient } from "expo-linear-gradient";
import { Link } from 'expo-router';


///////////////////////////////////////////////////////
//         CAMBIAAAAAAAAAAAAAAAAAAAA!!!!!           //
/////////////////////////////////////////////////////


import React, { useState } from 'react';
import { Controller, useForm } from 'react-hook-form'; // NOS PERMITE HACER EL DATA-BINDING
import { Button, Pressable, StyleSheet, Text, TextInput, View } from "react-native";
//import { Path, Defs, Stop } from "react-natie-svg";
//import * as Native from 'react-native';


// IMPORTACIÓN DE ASSETS
//import emoji5 from "./assets/images/emoji5.png";


export default function LoginForm() {


 // METEMOS TODO ESTO === ANTES === DEL RETURN
 const { control, handleSubmit, formState: { errors } } = useForm();
 const [submittedData, setSubmittedData] = useState(null);




 const onSubmit = data => console.log(data);


 return (
   <View
     /*style={{
       flex: 1,
       justifyContent: "center",
       alignItems: "center",
     }}*/
     style={[styles.container, styles.borderRadius]}
     //style={StyleSheet.flatten([styles.container, styles.borderRadius])}
   >
   <View style={styles.nav_bar}> 
     <Link href="/" style={StyleSheet.flatten([styles.button, styles.link])}>
       INICIO
     </Link>


     <Link href="/productos" style={StyleSheet.flatten([styles.button, styles.link])}>
       PRODUCTOS
     </Link>
    
     <Link href="/login" style={StyleSheet.flatten([styles.button, styles.link])}>
       LOGIN
     </Link>
   </View>


     <LinearGradient // EN DIAGONAL
       style={StyleSheet.flatten([styles.container, styles.borderRadius])}
       colors={['#12FFF7', 'purple']}
       //colors={['#B3FFAB','#12FFF7','purple']}
       start={{ x: 0, y: 0 }}
       end={{ x: 1, y: 1 }}
     >
       <h1 style={styles.h1}>LA PASTELERÍA</h1>
       <table style={styles.table}>
         <tbody>
           <tr>
             <td style={styles.borderRadius}>
               DONUTS
             </td>
             <td style={StyleSheet.flatten([styles.borderWhite, styles.borderRadius])}>PESTIÑOS</td>
             <td style={styles.td}>MUFFINS<Pressable /></td>
           </tr>
           <tr>
             <td>TARTA</td>
             <td>BIZCOCHO</td>
             <td>BROWNIE</td>
           </tr>
         </tbody>
       </table>


       <Text style={styles.text}>
         Desde 1995 creamos los mejores productos de pastelería para nuestros clientes. Y tú, ¿ya los has probado...?
       </Text>


       {/*
           ============================
            *       FORMULARIO       *
           ============================
           */}
       <View>
             {/* USERNAME */}
             <Controller
               control={control}
               name="username"
               rules={{ required: "Introduzca el user ID" }}
               render={({ field: { onChange, onBlur, value } }) => (
                 <TextInput
                   style={StyleSheet.flatten([styles.input, styles.borderRadius])}
                   placeholder="Usuario"
                   onBlur={onBlur}
                   onChangeText={onChange}
                   value={value}
                 />
               )}
             />
             {errors.username && (
               <Text style={styles.errorText}>{errors.username.message}</Text>
             )}


             {/* PASSWORD */}
             <Controller
               control={control}
               name="passwd"
               rules={{ required: "Debe introducir una contraseña" }}
               render={({ field: { onChange, onBlur, value } }) => (
                 <TextInput
                   secureTextEntry
                   style={StyleSheet.flatten([styles.input, styles.borderRadius])}
                   placeholder="Contraseña"
                   onBlur={onBlur}
                   onChangeText={onChange}
                   value={value}
                 />
               )}
             />
             {errors.passwd && (
               <Text style={styles.errorText}>{errors.passwd.message}</Text>
             )}


             {/* NOMBRE */}
             <Controller
               control={control}
               name="nombre"
               rules={{ required: "Introduzca su nombre" }}
               render={({ field: { onChange, onBlur, value } }) => (
                 <TextInput
                   style={StyleSheet.flatten([styles.input, styles.borderRadius])}
                   placeholder="Nombre"
                   onBlur={onBlur}
                   onChangeText={onChange}
                   value={value}
                 />
               )}
             />
             {errors.nombre && (
               <Text style={styles.errorText}>{errors.nombre.message}</Text>
             )}


             {/* APELLIDO 1 */}
             <Controller
               control={control}
               name="apellido1"
               rules={{ required: "Introduzca el primer apellido" }}
               render={({ field: { onChange, onBlur, value } }) => (
                 <TextInput
                   style={StyleSheet.flatten([styles.input, styles.borderRadius])}
                   placeholder="Primer apellido"
                   onBlur={onBlur}
                   onChangeText={onChange}
                   value={value}
                 />
               )}
             />
             {errors.apellido1 && (
               <Text style={styles.errorText}>{errors.apellido1.message}</Text>
             )}


             {/* APELLIDO 2 */}
             <Controller
               control={control}
               name="apellido2"
               rules={{ required: "Introduzca el segundo apellido" }}
               render={({ field: { onChange, onBlur, value } }) => (
                 <TextInput
                   style={StyleSheet.flatten([styles.input, styles.borderRadius])}
                   placeholder="Segundo apellido"
                   onBlur={onBlur}
                   onChangeText={onChange}
                   value={value}
                 />
               )}
             />
             {errors.apellido2 && (
               <Text style={styles.errorText}>{errors.apellido2.message}</Text>
             )}


             {/* TELÉFONO */}
             <Controller
               control={control}
               name="telefono"
               rules={{
                 required: "Introduzca un teléfono",
                 pattern: {
                   value: /^[0-9]{9}$/,
                   message: "El teléfono debe tener 9 dígitos",
                 },
               }}
               render={({ field: { onChange, onBlur, value } }) => (
                 <TextInput
                   keyboardType="numeric"
                   style={StyleSheet.flatten([styles.input, styles.borderRadius])}
                   placeholder="Teléfono"
                   maxLength={9}
                   onBlur={onBlur}
                   onChangeText={onChange}
                   value={value}
                 />
               )}
             />
             {errors.telefono && (
               <Text style={styles.errorText}>{errors.telefono.message}</Text>
             )}


             {/* DIRECCIÓN */}
             <Controller
               control={control}
               name="direccion"
               rules={{ required: "Introduzca su dirección" }}
               render={({ field: { onChange, onBlur, value } }) => (
                 <TextInput
                   style={StyleSheet.flatten([styles.input, styles.borderRadius])}
                   placeholder="Dirección"
                   onBlur={onBlur}
                   onChangeText={onChange}
                   value={value}
                 />
               )}
             />
             {errors.direccion && (
               <Text style={styles.errorText}>{errors.direccion.message}</Text>
             )}


             {/* EMAIL */}
             <Controller
               control={control}
               name="email"
               rules={{
                 required: "Introduzca su email",
                 pattern: {
                   value: /^[^\s@]+@[^\s@]+\.[^\s@]+$/,
                   message: "Formato de email no válido",
                 },
               }}
               render={({ field: { onChange, onBlur, value } }) => (
                 <TextInput
                   keyboardType="email-address"
                   autoCapitalize="none"
                   style={StyleSheet.flatten([styles.input, styles.borderRadius])}
                   placeholder="Email"
                   onBlur={onBlur}
                   onChangeText={onChange}
                   value={value}
                 />
               )}
             />
             {errors.email && (
               <Text style={styles.errorText}>{errors.email.message}</Text>
             )}


           </View>




       {/*
           =================
            *  SENT DATA  *
           =================
       */}
       {submittedData && (
         <View style={styles.submittedContainer}>
           <Text style={styles.submittedTitle}>Submitted Data:</Text>


           <Text style={styles.h4}>Datos enviados</Text>
           {/* A ESTO SE LE LLAMA DATA BINDING  */}
           <Text>Usuario: {submittedData.username}</Text>
           <Text>Contraseña: {submittedData.passwd}</Text>
           <Text>Nombre: {submittedData.nombre}</Text>
           <Text>Primer Apellido: {submittedData.apellido1}</Text>
           <Text>Segundo Apellido: {submittedData.apellido2}</Text>
           <Text>Teléfono: {submittedData.telefono}</Text>
           <Text>Dirección: {submittedData.direccion}</Text>
           <Text>Email: {submittedData.email}</Text>
         </View>
         )}


     </LinearGradient>
   </View>
 );
}


/**
* CUIDADO CON OLVIDAR PONER DOS PUNTOS!! text: table:
*/


const styles = StyleSheet.create({


 //////////////////////////////////////////////////////////////////////////////////
 // AÑADIMOS LOS ESTILOS DE LOS NUEVOS COMPONENTES QUE NECESITAMOS EN EL FORMULARIO
 //////////////////////////////////////////////////////////////////////////////////
  input: {
   backgroundColor: '#fff', // VA ENTRECOMILLADO
   borderStyle: 'dotted',
   borderWidth: 5,
   borderColor: 'lightblue',
   height: 40,
   marginBottom: 10,
   padding: 8,
 },
 errorText: {
   color: 'red',
   backgroundColor: '#fff',
   marginBottom: 10,
   padding: 5,
   borderRadius: 5,
 },
 //////////////////////////////////////////////////////////////////////////////////
 /////////////////////////////////////////////////////////////////////////////////


 borderRadius: {
   borderBottomLeftRadius: 8,
   borderBottomRightRadius: 8,
   borderTopLeftRadius: 8,
   borderTopRightRadius: 8,
 },
 borderWhite: {
   borderStyle: 'solid',
   borderWidth: 2,
   borderColor: '#fff',
 },
 button: {
   color: '#fff',
   textDecorationLine: "underline",
   width: 30,
 },
 container: {
   flex: 1,
   padding: 8,
   backgroundColor: '#332c62ff',
   alignItems: 'center',
 },
 h1: {
   color: 'white',
   fontFamily: 'verdana, arial, sans-serif',
 },
 h4: {
   color: 'lightgray',
   /*fontWeight: 'bold',*/
   fontFamily: 'verdana, arial, sans-serif',
 },
 hidden: {
   display: 'none',
 },
 link: {
   //width: 300,
   minWidth: 340,
 },
 nav_bar: {
   padding: 0,
   margin: 0,
   //justifyContent: 'flex-start',
   //alignSelf: 'flex-start',
   alignSelf: 'center',
 },
 submittedTitle: {
  
 },
 submittedContainer: {


 },
 table: {
   backgroundColor: '#dac151ff',
   fontFamily: 'verdana, arial, sans-serif',
   borderBottomLeftRadius: 8,
   borderBottomRightRadius: 8,
   borderTopLeftRadius: 8,
   borderTopRightRadius: 8,
   padding: 12,
  
   // EJECUTAAAAAA ANTES >>> npx expo add expo-linear-gradient
   //borderColor:['red','green','purple'],
 },
 td: { // El selector de tipo no me funciona
   //flex: 1,
   //display: 'block',
   justifyContent: 'center',
   borderStyle: 'solid',
   borderWidth: 2,
   borderRadius: 5,
   //borderColor: '#97801aff',
   color: '#fff',
   padding: 5,
   margin: 10,
 },
 text: {
   padding: 12,
   color: '#fff',
   display: 'contents',
   //float:
 },
 tinyImage: {
   width: 12,
   height: 12,
 },
});



