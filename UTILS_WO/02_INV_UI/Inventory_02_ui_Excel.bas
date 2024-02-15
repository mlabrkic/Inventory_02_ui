Sub No_04_B_INV_UI_U()
' Macro 13.01.2021. by mlabrkic
' CTRL + u (create a UI path)
'
' date: 2024-02M-15 18:54:40

  Dim x1 As Variant
  Dim sUtilsFolder As String, sPath As String, sFile As String

  Dim sSLA As String
  Dim sUItemplate As String, sUR_ID As String, sPort As String
  Dim iSLA As Integer

  sUtilsFolder = Worksheets("POPISI").Range("J4").Value
  sPath = sUtilsFolder & "\02_INV_UI\"
  sFile = "Pokreni_inventory_02_UI.bat"

  sSLA = Worksheets("RADNA").Range("B30").Value
  If (sSLA = "") Then
      iSLA = 0
  Else  ' SLA
      iSLA = 7
  End If

  sUItemplate = Worksheets("POPISI").Range("J3").Value
  sUR_ID = Worksheets("RADNA").Cells(26 + iSLA, 2).Value
  sPort = Worksheets("RADNA").Cells(27 + iSLA, 2).Value

  ' x1 = Shell("C:\...\02_INV_UI\Pokreni_inventory_02_UI.bat", vbNormalFocus)
  x1 = Shell(sPath + sFile + " " + sUItemplate + " " + sUR_ID + " " + sPort, vbNormalFocus)

End Sub

