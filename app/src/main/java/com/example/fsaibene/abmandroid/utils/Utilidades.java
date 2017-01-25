package com.example.fsaibene.abmandroid.utils;

import android.database.Cursor;
import android.os.Build;
import android.util.Log;

import com.example.fsaibene.abmandroid.provider.ContractParaEmpleados;

import org.json.JSONException;
import org.json.JSONObject;

public class Utilidades {
    // Indices para las columnas indicadas en la proyección
    public static final int COLUMNA_ID = 0;
    public static final int COLUMNA_ID_REMOTA = 1;
    public static final int COLUMNA_NOMBRE = 2;
    public static final int COLUMNA_APELLIDO = 3;
    public static final int COLUMNA_CARGO = 4;

    /**
     * Determina si la aplicación corre en versiones superiores o iguales
     * a Android LOLLIPOP
     *
     * @return booleano de confirmación
     */
    public static boolean materialDesign() {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP;
    }

    /**
     * Copia los datos de un gasto almacenados en un cursor hacia un
     * JSONObject
     *
     * @param c cursor
     * @return objeto jason
     */
    public static JSONObject deCursorAJSONObject(Cursor c) {
        JSONObject jObject = new JSONObject();
        String nombre;
        String apellido;
        String cargo;

        nombre = c.getString(COLUMNA_NOMBRE);
        apellido = c.getString(COLUMNA_APELLIDO);
        cargo = c.getString(COLUMNA_CARGO);

        try {
            jObject.put(ContractParaEmpleados.Columnas.NOMBRE, nombre);
            jObject.put(ContractParaEmpleados.Columnas.APELLIDO, apellido);
            jObject.put(ContractParaEmpleados.Columnas.CARGO, cargo);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        Log.i("Cursor a JSONObject", String.valueOf(jObject));

        return jObject;
    }
}
