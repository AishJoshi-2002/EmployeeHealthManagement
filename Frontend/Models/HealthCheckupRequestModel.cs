public class HealthCheckupRequestModel
{
    public string? employeeNo { get; set; }
    public string? employeeName { get; set; }
    public string? designation { get; set; }
    public string? division { get; set; }
    public string? employeeMobileNo { get; set; }
    public string? employeeLandlineNo { get; set; }
    public string? sbuEmployeeNo { get; set; }

    public int? stateId { get; set; }
    public string? stateName { get; set; }

    public int? cityId { get; set; }
    public string? cityName { get; set; }

    public int? hospitalId { get; set; }
    public string? hospitalName { get; set; }

    public List<DependentDto> SelectedDependents { get; set; }
        = new();

    public bool acceptDisclaimer { get; set; }
}