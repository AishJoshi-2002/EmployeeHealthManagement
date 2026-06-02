using System.ComponentModel.DataAnnotations;

namespace Frontend.Models;

public class HospitalModel
{
    [Required(ErrorMessage = "Hospital Code is required")]
    [MaxLength(7, ErrorMessage = "Hospital Code cannot exceed 7 characters")]
    public string? HospitalCode { get; set; }

    [Required(ErrorMessage = "Hospital Name is required")]
    [MaxLength(100, ErrorMessage = "Hospital Name cannot exceed 100 characters")]
    public string? HospitalName { get; set; }

    [Required(ErrorMessage = "Address Line 1 is required")]
    public string? Address1 { get; set; }

    public string? Address2 { get; set; }

    [Required(ErrorMessage = "State is required")]
    public int? StateId { get; set; }

    public string? StateName { get; set; }

    [Required(ErrorMessage = "City is required")]
    public int? CityId { get; set; }

    public string? CityName { get; set; }

    [Required(ErrorMessage = "Pincode is required")]
    public string? Pincode { get; set; }

    public string? ContactNoLL { get; set; }

    [Required(ErrorMessage = "Contact Person is required")]
    public string? ContactPerson { get; set; }

    [Required(ErrorMessage = "Designation is required")]
    public string? ContactDesignation { get; set; }

    [Required(ErrorMessage = "Email is required")]
    [EmailAddress(ErrorMessage = "Please enter a valid email")]
    public string? Email { get; set; }

    [Required(ErrorMessage = "Mobile Number is required")]
    [RegularExpression(@"^\d{10}$", ErrorMessage = "Contact Number must be exactly 10 digits")]
    public string? Mobile { get; set; }

    public string? AlternatePerson { get; set; }

    public string? AlternateDesignation { get; set; }
}