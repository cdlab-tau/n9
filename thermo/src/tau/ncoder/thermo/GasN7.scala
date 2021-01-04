package tau.ncoder.thermo

object GasN7 {
    
    val T_REF : Double = 1000.0
    
    val t__left : Double = 160.0
    val t_right : Double = 4800.0
    
    val t_min : Double = 200.00
    val t_max : Double = 4000.0
    
    val r_mu = 8.31451
    
    val mu__c = 12.0107
    val mu__h = 1.00794
    val mu__o = 15.9994
    val mu__s = 32.065
    val mu__n = 14.0067
    val mu_ar = 39.948
    val mu_he = 4.002602
    
    //    NASA/TP—2002-211556
    //    NASA Glenn Coefficients for Calculating
    //    Thermodynamic Properties of
    //    Individual Species
    //    Bonnie J. McBride, Michael J. Zehe, and Sanford Gordon
    //    Glenn Research Center, Cleveland, Ohio
    
    //    O2 Ref-Elm. Gurvich,1989 pt1 p94 pt2 p9.
    //    3 tpis89 O 2.00 0.00 0.00 0.00 0.00 0 31.9988000 0.000
    //    200.000 1000.0007 -2.0 -1.0 0.0 1.0 2.0 3.0 4.0 0.0 8680.104
    //    -3.425563420D+04 4.847000970D+02 1.119010961D+00 4.293889240D-03-6.836300520D-07
    //    -2.023372700D-09 1.039040018D-12 -3.391454870D+03 1.849699470D+01
    //    1000.000 6000.0007 -2.0 -1.0 0.0 1.0 2.0 3.0 4.0 0.0 8680.104
    //    -1.037939022D+06 2.344830282D+03 1.819732036D+00 1.267847582D-03-2.188067988D-07
    //    2.053719572D-11-8.193467050D-16 -1.689010929D+04 1.738716506D+01
    //    6000.000 20000.0007 -2.0 -1.0 0.0 1.0 2.0 3.0 4.0 0.0 8680.104
    //    4.975294300D+08-2.866106874D+05 6.690352250D+01-6.169959020D-03 3.016396027D-07
    //    -7.421416600D-12 7.278175770D-17 2.293554027D+06-5.530621610D+02
    
    val O2 = GasN7( id = "Oxygen (O2)", mu = 2.0 * mu__o,
        a = Array[ Double ]( -3.425563420E+04, +4.847000970E+02, +1.119010961E+00, +4.293889240E-03, -6.836300520E-07, -2.023372700E-09, +1.039040018E-12 ),
        b = Array[ Double ]( -1.037939022E+06, +2.344830282E+03, +1.819732036E+00, +1.267847582E-03, -2.188067988E-07, +2.053719572E-11, -8.193467050E-16 )
    )
    
    //    H2O Hf:Cox,1989. Woolley,1987. TRC(10/88) tuv25.
    //    2 g 8/89 H 2.00O 1.00 0.00 0.00 0.00 0 18.0152800 -241826.000
    //    200.000 1000.0007 -2.0 -1.0 0.0 1.0 2.0 3.0 4.0 0.0 9904.092
    //    -3.947960830D+04 5.755731020D+02 9.317826530D-01 7.222712860D-03-7.342557370D-06
    //    4.955043490D-09-1.336933246D-12 -3.303974310D+04 1.724205775D+01
    //    1000.000 6000.0007 -2.0 -1.0 0.0 1.0 2.0 3.0 4.0 0.0 9904.092
    //    1.034972096D+06-2.412698562D+03 4.646110780D+00 2.291998307D-03-6.836830480D-07
    //    9.426468930D-11-4.822380530D-15 -1.384286509D+04-7.978148510D+00
    
    val H2O = GasN7( id = "Hydrogen monoxide (H2O)", mu = 2.0 * mu__h + mu__o,
        a = Array[ Double ]( -3.947960830E+04, +5.755731020E+02, +9.317826530E-01, +7.222712860E-03, -7.342557370E-06, +4.955043490E-09, -1.336933246E-12 ),
        b = Array[ Double ]( +1.034972096E+06, -2.412698562E+03, +4.646110780E+00, +2.291998307E-03, -6.836830480E-07, +9.426468930E-11, -4.822380530E-15 )
    )
    
    //    CO2 Gurvich,1991 pt1 p27 pt2 p24.
    //    3 g 9/99 C 1.00O 2.00 0.00 0.00 0.00 0 44.0095000 -393510.000
    //    200.000 1000.0007 -2.0 -1.0 0.0 1.0 2.0 3.0 4.0 0.0 9365.469
    //    4.943650540D+04-6.264116010D+02 5.301725240D+00 2.503813816D-03-2.127308728D-07
    //    -7.689988780D-10 2.849677801D-13 -4.528198460D+04-7.048279440D+00
    //    1000.000 6000.0007 -2.0 -1.0 0.0 1.0 2.0 3.0 4.0 0.0 9365.469
    //    1.176962419D+05-1.788791477D+03 8.291523190D+00-9.223156780D-05 4.863676880D-09
    //    -1.891053312D-12 6.330036590D-16 -3.908350590D+04-2.652669281D+01
    //    6000.000 20000.0007 -2.0 -1.0 0.0 1.0 2.0 3.0 4.0 0.0 9365.469
    //    -1.544423287D+09 1.016847056D+06-2.561405230D+02 3.369401080D-02-2.181184337D-06
    //    6.991420840D-11-8.842351500D-16 -8.043214510D+06 2.254177493D+03
    
    val CO2 = GasN7( id = "Carbon dioxide (CO2)", mu = mu__c + 2.0 * mu__o,
        a = Array[ Double ]( +4.943650540E+04, -6.264116010E+02, +5.301725240E+00, +2.503813816E-03, -2.127308728E-07, -7.689988780E-10, +2.849677801E-13 ),
        b = Array[ Double ]( +1.176962419E+05, -1.788791477E+03, +8.291523190E+00, -9.223156780E-05, +4.863676880E-09, -1.891053312E-12, +6.330036590E-16 )
    )
    
    //    SO2 Gurvich,1989 pt1 p288 pt2 p175.
    //    2 tpis89 S 1.00O 2.00 0.00 0.00 0.00 0 64.0638000 -296810.000
    //    200.000 1000.0007 -2.0 -1.0 0.0 1.0 2.0 3.0 4.0 0.0 10548.127
    //    -5.310842140D+04 9.090311670D+02-2.356891244D+00 2.204449885D-02-2.510781471D-05
    //    1.446300484D-08-3.369070940D-12 -4.113752080D+04 4.045512519D+01
    //    1000.000 6000.0007 -2.0 -1.0 0.0 1.0 2.0 3.0 4.0 0.0 10548.127
    //    -1.127640116D+05-8.252261380D+02 7.616178630D+00-1.999327610D-04 5.655631430D-08
    //    -5.454316610D-12 2.918294102D-16 -3.351308690D+04-1.655776085D+01
    
    val SO2 = GasN7( id = "Sulfur dioxide (SO2)", mu = mu__s + 2.0 * mu__o,
        a = Array[ Double ]( -5.310842140E+04, +9.090311670E+02, -2.356891244E+00, +2.204449885E-02, -2.510781471E-05, +1.446300484E-08, -3.369070940E-12 ),
        b = Array[ Double ]( -1.127640116E+05, -8.252261380E+02, +7.616178630E+00, -1.999327610E-04, +5.655631430E-08, -5.454316610E-12, +2.918294102E-16 )
    )
    
    //    N2 Ref-Elm. Gurvich,1978 pt1 p280 pt2 p207.
    //    3 tpis78 N 2.00 0.00 0.00 0.00 0.00 0 28.0134000 0.000
    //    200.000 1000.0007 -2.0 -1.0 0.0 1.0 2.0 3.0 4.0 0.0 8670.104
    //    2.210371497D+04-3.818461820D+02 6.082738360D+00-8.530914410D-03 1.384646189D-05
    //    -9.625793620D-09 2.519705809D-12 7.108460860D+02-1.076003744D+01
    //    1000.000 6000.0007 -2.0 -1.0 0.0 1.0 2.0 3.0 4.0 0.0 8670.104
    //    5.877124060D+05-2.239249073D+03 6.066949220D+00-6.139685500D-04 1.491806679D-07
    //    -1.923105485D-11 1.061954386D-15 1.283210415D+04-1.586640027D+01
    //    6000.000 20000.0007 -2.0 -1.0 0.0 1.0 2.0 3.0 4.0 0.0 8670.104
    //    8.310139160D+08-6.420733540D+05 2.020264635D+02-3.065092046D-02 2.486903333D-06
    //    -9.705954110D-11 1.437538881D-15 4.938707040D+06-1.672099740D+03
    
    val N2 = GasN7( id = "Nitrogen (N2)", mu = 2.0 * mu__n,
        a = Array[ Double ]( +2.210371497E+04, -3.818461820E+02, +6.082738360E+00, -8.530914410E-03, +1.384646189E-05, -9.625793620E-09, +2.519705809E-12 ),
        b = Array[ Double ]( +5.877124060E+05, -2.239249073E+03, +6.066949220E+00, -6.139685500E-04, +1.491806679E-07, -1.923105485E-11, +1.061954386E-15 )
    )
    
    //    Ar Ref-Elm. Moore,1971. Gordon,1999.
    //    3 g 3/98 AR 1.00 0.00 0.00 0.00 0.00 0 39.9480000 0.000
    //    200.000 1000.0007 -2.0 -1.0 0.0 1.0 2.0 3.0 4.0 0.0 6197.428
    //    0.000000000D+00 0.000000000D+00 2.500000000D+00 0.000000000D+00 0.000000000D+00
    //    0.000000000D+00 0.000000000D+00 -7.453750000D+02 4.379674910D+00
    //    1000.000 6000.0007 -2.0 -1.0 0.0 1.0 2.0 3.0 4.0 0.0 6197.428
    //    2.010538475D+01-5.992661070D-02 2.500069401D+00-3.992141160D-08 1.205272140D-11
    //    -1.819015576D-15 1.078576636D-19 -7.449939610D+02 4.379180110D+00
    //    6000.000 20000.0007 -2.0 -1.0 0.0 1.0 2.0 3.0 4.0 0.0 6197.428
    //    -9.951265080D+08 6.458887260D+05-1.675894697D+02 2.319933363D-02-1.721080911D-06
    //    6.531938460D-11-9.740147729D-16 -5.078300340D+06 1.465298484D+03
    
    val Ar = GasN7( id = "Argon (Ar)", mu = mu_ar,
        a = Array[ Double ]( +0.000000000E+00, +0.000000000E+00, +2.500000000E+00, +0.000000000E+00, +0.000000000E+00, +0.000000000E+00, +0.000000000E+00 ),
        b = Array[ Double ]( +2.010538475E+01, -5.992661070E-02, +2.500069401E+00, -3.992141160E-08, +1.205272140E-11, -1.819015576E-15, +1.078576636E-19 )
    )
    
    //    He Ref-Elm. Moore,1971. Moore,1970a. Gordon,1999.
    //    3 g 5/97 HE 1.00 0.00 0.00 0.00 0.00 0 4.0026020 0.000
    //    200.000 1000.0007 -2.0 -1.0 0.0 1.0 2.0 3.0 4.0 0.0 6197.428
    //    0.000000000D+00 0.000000000D+00 2.500000000D+00 0.000000000D+00 0.000000000D+00
    //    0.000000000D+00 0.000000000D+00 -7.453750000D+02 9.287239740D-01
    //    1000.000 6000.0007 -2.0 -1.0 0.0 1.0 2.0 3.0 4.0 0.0 6197.428
    //    0.000000000D+00 0.000000000D+00 2.500000000D+00 0.000000000D+00 0.000000000D+00
    //    0.000000000D+00 0.000000000D+00 -7.453750000D+02 9.287239740D-01
    //    6000.000 20000.0007 -2.0 -1.0 0.0 1.0 2.0 3.0 4.0 0.0 6197.428
    //    3.396845420D+06-2.194037652D+03 3.080231878D+00-8.068957550D-05 6.252784910D-09
    //    -2.574990067D-13 4.429960218D-18 1.650518960D+04-4.048814390D+00
    
    val He = GasN7( id = "Helium (He)", mu = mu_he,
        a = Array[ Double ]( +0.000000000E+00, +0.000000000E+00, +2.500000000E+00, +0.000000000E+00, +0.000000000E+00, +0.000000000E+00, +0.000000000E+00 ),
        b = Array[ Double ]( +0.000000000E+00, +0.000000000E+00, +2.500000000E+00, +0.000000000E+00, +0.000000000E+00, +0.000000000E+00, +0.000000000E+00 )
    )
    
    //    Air Mole%:N2 78.084,O2 20.9476,Ar .9365,CO2 .0319.Gordon,1982.Reac
    //    2 g 9/95 N 1.5617O .41959AR.00937C .00032 .00000 0 28.9651159 -125.530
    //    200.000 1000.0007 -2.0 -1.0 0.0 1.0 2.0 3.0 4.0 0.0 8649.264
    //    1.009950160D+04-1.968275610D+02 5.009155110D+00-5.761013730D-03 1.066859930D-05
    //    -7.940297970D-09 2.185231910D-12 -1.767967310D+02-3.921504225D+00
    //    1000.000 6000.0007 -2.0 -1.0 0.0 1.0 2.0 3.0 4.0 0.0 8649.264
    //    2.415214430D+05-1.257874600D+03 5.144558670D+00-2.138541790D-04 7.065227840D-08
    //    -1.071483490D-11 6.577800150D-16 6.462263190D+03-8.147411905D+00
    
}

case class GasN7(id : String, mu : Double, a : Array[ Double ], b : Array[ Double ]) {
    
    val r : Double = GasN7.r_mu / mu
    
    val kcLo : Array[ Double ] = a.map( _ * r )
    val kcHi : Array[ Double ] = b.map( _ * r )
    
}
