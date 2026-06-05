using Microsoft.Extensions.Configuration;
using System.Net.Http.Json;

public class MedicalPortalService
{
    private readonly HttpClient _httpClient;
    private readonly string _backendUrl;

    public MedicalPortalService(
        HttpClient httpClient,
        IConfiguration configuration)
    {
        _httpClient = httpClient;
        _backendUrl = configuration["BackendUrl"]!;
    }

    public async Task<EmployeeDto?> GetEmployeeAsync()
    {
        return await _httpClient.GetFromJsonAsync<EmployeeDto>(
            $"{_backendUrl}/api/medical-portal/employee");
    }

    public async Task<List<DependentDto>> GetDependentsAsync()
    {
        return await _httpClient.GetFromJsonAsync<List<DependentDto>>(
            $"{_backendUrl}/api/medical-portal/dependents")
            ?? new List<DependentDto>();
    }
}
