using System.ComponentModel.DataAnnotations;

namespace Frontend.Models;

public class HospitalModel
{
    [Required(ErrorMessage = "Hospital Code is required")]
    [MaxLength(7, ErrorMessage = "Hospital Code cannot exceed 7 characters")]
    public string? hospitalId { get; set; }

    [Required(ErrorMessage = "Hospital Name is required")]
    [MaxLength(100, ErrorMessage = "Hospital Name cannot exceed 100 characters")]
    public string? name { get; set; }

    [Required(ErrorMessage = "Address Line 1 is required")]
    public string? address1 { get; set; }

    public string? address2 { get; set; }

    [Required(ErrorMessage = "State is required")]
    public int? stateId { get; set; }

    public string? stateName { get; set; }

    [Required(ErrorMessage = "City is required")]
    public int? cityId { get; set; }

    public string? cityName { get; set; }

    [Required(ErrorMessage = "Pincode is required")]
    public string? pincode { get; set; }

    public string? contactNoLL { get; set; }

    [Required(ErrorMessage = "Contact Person is required")]
    public string? contactPerson { get; set; }

    [Required(ErrorMessage = "Designation is required")]
    public string? contactPersonDesignation { get; set; }

    [Required(ErrorMessage = "Email is required")]
    [EmailAddress(ErrorMessage = "Please enter a valid email")]
    public string? contactPersonEmail { get; set; }

    [Required(ErrorMessage = "Mobile Number is required")]
    [RegularExpression(@"^\d{10}$", ErrorMessage = "Contact Number must be exactly 10 digits")]
    public string? contactNoM { get; set; }

    public string? altContactPerson { get; set; }

    public string? altContactPersonDesignation { get; set; }
}