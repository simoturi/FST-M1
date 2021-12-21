import pandas
from pandas import ExcelWriter
data = {
	'FirstName':["Satvik", "Avinash", "Lahri"],
	'LastName':["Shah", "Kati", "Rath"],
	'Email':["devel@yahoo.com", "avinash@example.com", "lahri.rath@example.com"],
	'PhoneNumber':["2134567898", "214567898", "2156789878"]
}
dataframe = pandas.DataFrame(data)
print(dataframe)
writer = ExcelWriter('sample.xlsx')
dataframe.to_excel(writer, 'Sheet1', index = False)
writer.save()